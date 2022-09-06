fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

/*
Inspired on
https://dev.to/mohsenbazmi/disastrous-constructors-in-unit-tests-4fn
https://dev.to/mohsenbazmi/clean-test-value-object-creation-272g

Principles
 - TDD, DRY
 - (Production) Constructors should reflect the nature of data
 - Role of testing values should be clear from code

 */
// TODO refactor Point to take z value with trim cutoff of 70
// TODO compare refactor (after addressing tech debt) to take z value with trim cutoff of 70

data class Point(var x: Int, var y: Int) {
    init {
        x = minOf(x, X_CUTOFF)
        y = minOf(y, Y_CUTOFF)
    }

    companion object {
        private const val X_CUTOFF = 50
        private const val Y_CUTOFF = 80
    }
}

// fixme fix tech debt create helper

/*
Final notes:
- This will save a lot of time when refactoring
- This will make test values clearer
- This is just a first step in improving some testing practices.
 In the future this could include randomizer for not specified values
 - Some Helpers could be included as methods in the class definition
*/