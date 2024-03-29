package proga_lab_5.city

/**
 * City compare by default
 *
 * @constructor Create empty City compare by default
 */
class CityCompareByDefault : Comparator<City>{
    override fun compare(o1: City?, o2: City?): Int {
    if(o1!!.getPopulation() === o2!!.getPopulation()){
        return 0
    }
    return if(o1!!.getPopulation()!! > o2!!.getPopulation()!!){
        1
    }else{
        -1
    }
}
}