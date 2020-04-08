angular.module("deleteUserModule", [])
  .controller("deleteUserController", ['$scope', '$http',function ($scope, $http){
	  $scope.userId;
	  $scope.deleteResult;
	  $scope.deleteUser = function(){
		  $http.get("http://localhost:9000/deleteUser?userID="+$scope.userId)
		  .success(function(data){
			  $scope.courses = data;
			  $scope.deleteResult = "User Deleted Successfully !";
		  })
		  .error(function(data){
			  $scope.deleteResult = "ERROR !";
		  });
	  };
  }]);
