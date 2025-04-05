
fun main() {

    check(
        name = "when have an address (with four segments and valid numbers) it should return true",
        result = isValidIPv4Address("192.24.1.44"),
        correctResult = true
    )

    check(
        name = "when have an address (with four segments and contains number 0) it should return true",
        result = isValidIPv4Address("192.0.1.44"),
        correctResult = true
    )

    check(
        name = "when have an address (with four segments with number 0 on each) it should return true",
        result = isValidIPv4Address("0.0.0.0"),
        correctResult = true
    )

    check(
        name = "when have an address (contains out of range number) it should return false",
        result = isValidIPv4Address("192.256.1.44"),
        correctResult = false
    )

    check(
        name = "when have an address (contains leading zeros) it should return false",
        result = isValidIPv4Address("192.111.001.44"),
        correctResult = false
    )

    check(
        name = "when have an address (with five segments) it should return false",
        result = isValidIPv4Address("192.16.1.44.55"),
        correctResult = false
    )

    check(
        name = "when have an address (contains blank segment) it should return false",
        result = isValidIPv4Address("18.44..64"),
        correctResult = false
    )

    check(
        name = "when have an address (contains empty segment) it should return false",
        result = isValidIPv4Address("18.44.  .64"),
        correctResult = false
    )

    check(
        name = "when have an (empty address) it should return false",
        result = isValidIPv4Address(""),
        correctResult = false
    )

    check(
        name = "when have an address (contains whitespace) it should return false",
        result = isValidIPv4Address("192.24.1 .44"),
        correctResult = false
    )

    check(
        name = "when have an address (contains invalid character) it should return false",
        result = isValidIPv4Address("192.24.*b.44"),
        correctResult = false
    )

    check(
        name = "when have an address (contains only dots) it should return false",
        result = isValidIPv4Address("..."),
        correctResult = false
    )

    check(
        name = "when have an address (contains dot before address) it should return false",
        result = isValidIPv4Address(".108.0.1.16"),
        correctResult = false
    )

    check(
        name = "when have an address (contains comma instead of dot) it should return false",
        result = isValidIPv4Address("108.0.10,16"),
        correctResult = false
    )

    check(
        name = "when have an address (contains negative number) it should return false",
        result = isValidIPv4Address("108.0.-10.16"),
        correctResult = false
    )
}

fun check(name: String, result: Boolean, correctResult: Boolean) {
    if(result == correctResult) {
        println("Success - $name")
    } else {
        println("Failed - $name")
    }
}