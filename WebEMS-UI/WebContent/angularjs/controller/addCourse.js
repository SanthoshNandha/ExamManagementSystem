angular.module("addCourse", [])
  .controller("addNewCourseController", ['$scope', '$http',function ($scope, $http)
  {
	  $scope.newCourse = {
			  'courseName':"",
			  'courseCode':"",
			  'sem':{}
		};
	  
	  $scope.submitNewCourse =function(submitCourseResult) {
		    $http.post('http://localhost:9000/addNewCourse',$scope.newCourse).
		        success(function(data, status, headers, config) {
		        	$scope.submitCourseResult = data;
		        	if($scope.submitCourseResult.status == "Success"){
		        		$scope.submitStatus = "Course Added Successfully"
		        	}
		        	else{
		        		$scope.submitStatus = "Course Add failed!"
		        	}
		        })
		        .error(function(data, status, headers, config)
			            {
			              $scope.submitUserResult = "Error while submitting";
			              $scope.submitStatus = "Course Add failed!"
			            });
		    
		    $scope.newCourse = {
		    		'courseName':"",
					 'courseCode':"",
					 'sem':{}
				};
		};
  }]);