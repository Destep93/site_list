app.controller('ServiceController', function ($scope, $http) {
    
    $http.get('service/get').then(function (data) {
        $scope.peoples = data.data;
    });
    
    $scope.getSite = function (id) {
        $http.get('service/getSites/'+ $scope.peoples[id].people_id).then(function (data) {
            $scope.sites = data.data;
            console.log($scope.sites);
        });
    };
    
    $scope.savePeople = function () {
        $http.put('service', $scope.addPeople).then(function (data) {
            $scope.addPeople = {};
            $http.get('service/get').then(function (data) {
                $scope.peoples = data.data;
            });
        });
    };
    
    $scope.delPeople = function (id) {
        $http.delete('service/' + $scope.peoples[id].id).then(function (data) {
            $http.get('service/get').then(function (data) {
                $scope.peoples = data.data;
            });
        });
    };
});

