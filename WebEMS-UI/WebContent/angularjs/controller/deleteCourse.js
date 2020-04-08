angular.module("deleteCourseModule", [])
  .controller("deleteCourseController", ['$scope', '$http',function ($scope, $http){
	  $scope.courseId;
	  $scope.deleteResult;
	  $scope.deleteCourse = function(){
		  $http.get("http://localhost:9000/deleteCourse?courseId="+$scope.courseId)
		  .success(function(data){
			  $scope.result = data;
			  $scope.deleteResult = "User Deleted Successfully !";
		  })
		  .error(function(data){
			  $scope.deleteResult = "ERROR !";
		  });
	  };
  }]);
