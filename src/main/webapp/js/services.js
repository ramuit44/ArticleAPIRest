angular.module('articleApp').service('Article', ['$http', function($http) {
	var Article= {};
	
	
	
	Article.getAllArticles = function(configParams) {
		return $http.get('./bankerDeals',{
			params: configParams
		});

	};
	
	
	return Article;
}]);