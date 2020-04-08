angular.module("addNewQuestion", [])
  .controller("addNewQuestionController", ['$scope', '$http',function ($scope, $http)
  {
	  $scope.choice1;
	  $scope.choice2;
	  $scope.choice3;
	  $scope.choice4;
	  $scope.choice5;
	  
	  $scope.newQuestion = {
			  questionId : "",
			  question : "",
			  choices :[],
			  answer : "",
			  point : "",
			  courseId : ""
		};
	  $scope.courses={};
	  $scope.loadpage = function(){
		  $http.get('http://localhost:9000/getAllCourse')
		  .success(function(data){
			  $scope.courses = data;
		  })
		  .error(function(data){
			  $scope.courses = "course load failed"
		  });
	  };
	  $scope.submitNewQuestion =function(submitQuestionResult) {
		  if($scope.choice1 != null){
			  $scope.newQuestion.choices.push($scope.choice1);
		  }
		  if($scope.choice2 != null){
			  $scope.newQuestion.choices.push($scope.choice2);
		  }
		  if($scope.choice3 != null){
			  $scope.newQuestion.choices.push($scope.choice3);
		  }
		  if($scope.choice4 != null){
			  $scope.newQuestion.choices.push($scope.choice4);
		  }
		  if($scope.choice5 != null){
			  $scope.newQuestion.choices.push($scope.choice5);
		  }
		  $http.post('http://localhost:9000/addNewQuestion',$scope.newQuestion)
		        .success(function(data, status, headers, config) {
		        	$scope.submitQuestionResult = data;
		        	if($scope.submitQuestionResult.status == "Success"){
		        		$scope.submitStatus = "Question Added Successfully"
		        	}
		        	else{
		        		$scope.submitStatus = "Question Add failed!"
		        	}
		        })
		        .error(function(data, status, headers, config)
			            {
			              $scope.submitQuestionResult = "Error while submitting";
			              $scope.submitStatus = "Question Add failed!"
			            });
		    $scope.newQuestion = {
					  questionId : "",
					  questionTypeId : "",
					  choices:[],
					  question : "",
					  answer : "",
					  point : "",
					  courseId : ""
				};
		      $scope.choice1="";
			  $scope.choice2="";
			  $scope.choice3="";
			  $scope.choice4="";
			  $scope.choice5="";
		};
  }]);