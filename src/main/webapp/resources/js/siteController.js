

app.controller('SiteController', function ($scope, $http, $location, $rootScope) {


    $rootScope.param = $location.path();
    $scope.sites = [];


    $http.get('site/get').then(function (data) {
        $scope.sites = data.data;
    });

    $scope.saveSite = function () {
        $http.put('site', $scope.addsite).then(function (data) {
            $scope.addsite = {};
            $http.get('site/get').then(function (data) {
                $scope.sites = data.data;
            });
        });
    };

    $scope.editSite = function () {
        $http.post('site', $scope.editsite).then(function (data) {
            $scope.editsite = {};
            $http.get('site/get').then(function (data) {
                $scope.sites = data.data;
            });
        });
    };

    $scope.delSite = function (id) {
        $http.delete('site/' + $scope.sites[id].id).then(function (data) {
            $http.get('site/get').then(function (data) {
                $scope.sites = data.data;
            });
        });
    };
});