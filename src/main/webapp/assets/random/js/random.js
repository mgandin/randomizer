var Random = Backbone.Model.extend({
	number: null,
	maxRange: null,
	series: [],
	url: function() {
		return '/randomizer-1.0-SNAPSHOT/rest/randomizer/' + this.maxRange + '/' + this.number;
	}
});

var AppView = Backbone.View.extend({
	el: $("body"),
	events: {
		"click #get-random": "updateRandoms",
	},
	updateRandoms: function() {	
		var howMuch = $("#how-much").val();
		var max = $("#max-range").val();
		var random = new Random();
		random.number = howMuch;
		random.maxRange = max;
		random.fetch({success: this.refresh});
	},
	refresh: function(model,response) {
		var series = model.get('series');
		$("#random-list").empty();
		_.each(series,function(num) {
			$("#random-list").append("<tr><td>" + num + "</td></tr>");
		});
	}
});
var appView = new AppView;