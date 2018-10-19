﻿(function () {
    'use strict';

    angular
        .module('attendU')
        .factory('UserService', UserService);

    UserService.$inject = ['$http', '$timeout', '$q'];
    function UserService($http, $timeout, $q) {
		var backend = "localhost";
		var userPort = "8004";
		
        var service = {};

        service.GetAll = GetAll;
        service.GetById = GetById;
        service.GetByUsername = GetByUsername;
        service.Update = Update;
        service.Delete = Delete;

		service.Registration = Registration;
		
        return service;

		function Registration(info) {
			return $http.post('http://'+backend+':'+userPort+'/user/registration', info).then(handleSuccess, handleError('Error register with server'));		
		}
		
        function GetAll() {
            return $http.get('/api/users').then(handleSuccess, handleError('Error getting all users'));
        }

        function GetById(id) {
            return $http.get('/api/users/' + id).then(handleSuccess, handleError('Error getting user by id'));
        }

        function GetByUsername(username) {
            return $http.get('/api/users/' + username).then(handleSuccess, handleError('Error getting user by username'));
        }

        function Update(user) {
            return $http.put('/api/users/' + user.id, user).then(handleSuccess, handleError('Error updating user'));
        }

        function Delete(id) {
            return $http.delete('/api/users/' + id).then(handleSuccess, handleError('Error deleting user'));
        }

        // private functions

        function handleSuccess(res) {
            return res.data;
        }

        function handleError(error) {
            return function () {
                return { success: false, message: error };
            };
        }
    }

})();
