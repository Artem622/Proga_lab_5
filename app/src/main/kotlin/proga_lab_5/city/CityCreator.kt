package proga_lab_5.city

import proga_lab_5.collection
import java.time.LocalDateTime
import java.time.ZonedDateTime

class CityCreator {
    fun create(name : String, coordX : Long, coordY : Float, area: Int, population: Long, meters: Long, agl: Double, climate:String, government: String, birthday : ZonedDateTime, age : Int){
        val city = City()
        city.setId(0)

        city.setCreationDate(LocalDateTime.now())

        city.setName(name)

        val coordinates = Coordinates(coordX, coordY)
        city.setCoordinates(coordinates)

        city.setArea(area)

        city.setPopulation(population)

        city.setMetersAboveSeaLevel(meters)

        city.setAgglomeration(agl)

        city.setClimate(Climate.valueOf(climate))

        city.setGovernment(Government.valueOf(government))

        val governor = Human(age.toString(), birthday.toString())
        city.setGovernor(governor)


        collection.add(city)

    }
}
