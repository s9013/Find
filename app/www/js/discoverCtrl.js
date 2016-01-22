angular.module('starter.discoverCtrl', [])

.controller('DiscoverCtrl',function($scope,$data) {
     
      //$scope.test = function(){
             $data.discoverFind("discover")
          .success(function(data){
              if(data == null){
                  return;
              }
              console.log(data);
              //alert(JSON.stringify(data));
              $scope.data = data;
          })
          .finally(function(){
              $timeout(function(){
                  $scope.$broadcast("scroll.infiniteScrollComplete");
              },2000);
          });
         // }
})


.controller('DiscoverDetailCtrl',function($scope,$data, $stateParams) {
     console.log($stateParams.id);
     $data.discoverFindById("discover",{id:$stateParams.id}).success(function(data){
        console.log(data);
        $scope.data = data;
     })
})