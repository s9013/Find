angular.module('starter.controllers', [])

.controller('DashCtrl',function($scope,$data,$ionicModal,$timeout,$ionicLoading) {
     
 
       
      $scope.test = function(){
         $data.findAll("dash")
      .success(function(data){
          if(data == null){
              return;
          }
          console.log(data);
          alert(JSON.stringify(data));
          $scope.weather = data['HeWeather data service 3.0'][0];
      })
      .finally(function(){
          $timeout(function(){
              $scope.$broadcast("scroll.infiniteScrollComplete");
          },2000);
      });
      }


})

.controller('ChatsCtrl', function($scope, Chats) {
  // With the new view caching in Ionic, Controllers are only called
  // when they are recreated or on app start, instead of every page change.
  // To listen for when this page is active (for example, to refresh data),
  // listen for the $ionicView.enter event:
  //
  //$scope.$on('$ionicView.enter', function(e) {
  //});

  $scope.chats = Chats.all();
  $scope.remove = function(chat) {
    Chats.remove(chat);
  };
})

.controller('ChatDetailCtrl', function($scope, $stateParams, Chats) {
  $scope.chat = Chats.get($stateParams.chatId);
})

.controller('AccountCtrl', function($scope) {
  $scope.settings = {
    enableFriends: true
  };
});
