import java.awt.Color

fun main(args: Array<String>) {
    println("The quality gate WITH IF MODE JAVA is : ${getQualityGateWithIfModeJava(99)}")
    println("The quality gate WITH IF MODE JAVA is : ${getQualityGateWithIfModeJava(38)}")
    println("The quality gate WITH IF MODE JAVA is : ${getQualityGateWithIfModeJava(13)}")

    println("The quality gate WITH IF MODE KOTLIN is : ${getQualityGateWithIfModeKotlin(99)}")
    println("The quality gate WITH IF MODE KOTLIN is : ${getQualityGateWithIfModeKotlin(38)}")
    println("The quality gate WITH IF MODE KOTLIN is : ${getQualityGateWithIfModeKotlin(13)}")

    println("The quality gate is : ${getQualityGate(99)}")
    println("The quality gate is : ${getQualityGate(38)}")
    println("The quality gate is : ${getQualityGate(13)}")

    println("The quality gate is : ${getQualityGateALittleWeird("FAILED")}")
}

fun getQualityGateWithIfModeJava(percentage: Int): Pair<String, Color> {
    if(percentage < 35) {
        return "Failed" to Color.RED
    } else if(percentage > 35 && percentage < 46) {
        return "Warning" to Color.ORANGE
    }

    return "Passed" to Color.GREEN
}

fun getQualityGateWithIfModeKotlin(percentage: Int) =
        if(percentage < 35) "Failed" to Color.RED
        else if(percentage in 36..45) "Warning" to Color.ORANGE
        else "Passed" to Color.GREEN

fun getQualityGate(percentage: Int) = when {
    percentage < 35 -> "Failed" to Color.RED
    percentage in 36..45 -> "Warning" to Color.ORANGE
    else -> "Passed" to Color.GREEN
}

fun getQualityGateALittleWeird(percentage: Any) = when {
    percentage !is Int -> "¯\\_(ツ)_/¯"
    percentage < 35 -> "Failed" to Color.RED
    percentage in 36..45 -> "Warning" to Color.ORANGE
    else -> "Passed" to Color.GREEN
}

