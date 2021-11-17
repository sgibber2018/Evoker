/**
 * A place for things having to do with random numbers.
 */

fun withChance(outOf: Int, chanceOf: Int): Boolean {
    return chanceOf < (0..outOf).random()
}