angular.module("addNewExam", ['ngCookies'])
  .controller("addNewExamController", ['$scope','$cookies', '$cookieStore', '$http',function ($scope, $cookies, $cookieStore, $http)
  {
	  $scope.userId = $cookieStore.get("userId");
	  $scope.newExam = {
			  'courseId':"",
			  'examTypeID':"",
			  'examName':"",
			  'desc':"",
			  'duration':"",
			  'maxScore':"",
			  'passScore':"",
			  'noofQuestions':"",
			  'availableFrom':"",
			  'availableTo':"",
			  'questionIds':{},
		};
	  $scope.examTypes = {};
	  $scope.questions = [];
	  $scope.courses = [];
	  
	  $scope.loadpage = function(){
		  $scope.parameters = {
				  'userId' : $scope.userId,
	       };
	       $scope.config = {
	                'params': $scope.parameters
	       };
		  $http.get('http://localhost:9000/getCoursesforUser',$scope.config)
		  .success(function(data){
			$scope.courses = data; 
		  })
		  .error(function(){
			 $scope.courseload = "course load failed"; 
		  });
		  $http.get('http://localhost:9000/getAllExamTypes')
		  .success(function(data){
			  $scope.examTypes = data;
		  })
		  .error(function(){
			  $scope.examTypeload = "Exam Type load failed"; 
		  });
	  };
	  
	  $scope.loadQuestions = function(){
		  $scope.parameters = {
				  'courseId' : $scope.newExam.courseId
	       };
	       $scope.config = {
	                'params': $scope.parameters
	       };
		  $http.get('http://localhost:9000/getQuestionsforCourse',$scope.config)
		  	.success(function(data){
		  		$scope.questions = data;
		  	})
		  	.error(function(data){
		  		$scope.submitUserResult = "Error while submitting";
	              $scope.submitStatus = "User Add failed!"
		  });
	  };
	  
	  $scope.submitNewExam =function(submitExamResult) {
		    $http.post('http://localhost:9000/addNewExamination',$scope.newExam).
		        success(function(data, status, headers, config) {
		        	$scope.submitExamResult = data;
		        	if($scope.submitExamResult.status == "Success"){
		        		$scope.submitStatus = "Exam Added Successfully"
		        	}
		        	else{
		        		$scope.submitStatus = "Exam Add failed!"
		        	}
		        })
		        .error(function(data, status, headers, config)
			            {
			              $scope.submitStatus = "Exam Add failed!"
			            });
		};
  }]);
