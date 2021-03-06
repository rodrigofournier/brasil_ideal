package pubcup

class Location {
	String id
	String name
	String description
	List location
	
	static mapWith = "mongo"
	
	static hasMany = [ events:Event ]
	
	static mappings = {
		location geoIndex: true
	}

}
