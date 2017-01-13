

app.controller('ServiceController', function ($scope, $http) {
    
    $scope.createNewEntity = function (   ){
        $http.get('service/1').then(function (data) {
            console.log(data);
        });
//        $http.post('service/1', $scope.people).then(function (data) {
//            
//        });
    };
    $scope.getEntity = function (  ){
        $http.get('service/2').then(function (data) {
            console.log(data.data);
        });
    }
});

