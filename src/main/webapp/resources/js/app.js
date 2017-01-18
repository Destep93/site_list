
var app = angular.module('app', ['ngResource', 'ngRoute']);


app.config(function ($httpProvider, $routeProvider, $locationProvider) {
    $routeProvider
        .otherwise({redirectTo: '/site'})
        .when('/site', {
            controller: 'SiteController',
            templateUrl: 'res/tpl/site.html'
        })
        .when('/people', {
            controller: 'PeopleController',
            templateUrl: 'res/tpl/people.html'
        });

   /* $httpProvider.defaults.withCredentials = true;*/
    //$locationProvider.html5Mode(true).hashPrefix('!');
});


app.controller('MainController', function ($scope, $http, $location, $rootScope) {
//    $rootScope.param = $location.path();
});
