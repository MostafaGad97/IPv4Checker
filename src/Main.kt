
fun main() {

}

fun isValidIPv4Address(address: String): Boolean {

    val segmentsList = address.split('.')
    if(segmentsList.size != 4) return false

    for (segment in segmentsList) {

        if(segment.isEmpty()) return false

        if(segment.length > 1 && segment[0] == '0') return false

        if(segment.toIntOrNull() == null) return false

        if(segment.toInt() !in 0..255) return false
    }

    return true
}