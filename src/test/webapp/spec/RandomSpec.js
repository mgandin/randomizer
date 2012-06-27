describe("The model should give a correct URL when correctly populed", function() {

	beforeEach(function() {
		this.random = new Random();
		this.server = sinon.fakeServer.create();
	});

	afterEach(function() {
		this.server.restore();
	});

	it("should return the default url", function() {
		this.random.number = '2';
		this.random.maxRange = '45'
		expect(this.random.url()).toEqual("/randomizer-1.0-SNAPSHOT/rest/randomizer/45/2");

	});

	it("should fetch the new random", function() {
		this.random.number = '2';
		this.random.maxRange = '45'
		expect(this.random.url()).toEqual("/randomizer-1.0-SNAPSHOT/rest/randomizer/45/2");
		// On en est là
		this.random.fetch({success: function(model,response) {
			var series = model.get('series');
		}});	
	});

});
