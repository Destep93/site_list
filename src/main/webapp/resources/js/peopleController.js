app.controller('PeopleController', function ($scope, $http, $rootScope, $location) {
    
    $rootScope.param = $location.path();
    
    $http.get('people/get').then(function (data) {
        $scope.peoples = data.data;
    });
    
    $scope.getSite = function (id) {
        $http.get('people/getSites/'+ $scope.peoples[id].people_id).then(function (data) {
            $scope.sites = data.data;
            console.log($scope.sites);
        });
    };
    
    $scope.savePeople = function () {
        $http.put('people', $scope.addPeople).then(function (data) {
            $scope.addPeople = {};
            $http.get('people/get').then(function (data) {
                $scope.peoples = data.data;
            });
        });
    };
    
    $scope.delPeople = function (id) {
        $http.delete('people/' + $scope.peoples[id].people_id).then(function (data) {
            $http.get('people/get').then(function (data) {
                $scope.peoples = data.data;
            });
        });
    };
});

