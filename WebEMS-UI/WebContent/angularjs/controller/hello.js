function Hello($scope, $http) {
    $http.get('http://localhost:9000/hello-world?name=sharon').
        success(function(data) {
            $scope.greeting = data;
        });
}