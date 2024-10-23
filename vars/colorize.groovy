def call(String input, String color) {
    def colors = [
        'red': '\u001B[31m',
        'green': '\u001B[32m',
        'blue': '\u001B[34m',
        'reset': '\u001B[0m'
    ]

    if (!colors.containsKey(color)) {
        throw new IllegalArgumentException("Unsupported color: $color. Use 'red', 'green', or 'blue'.")
    }
    
    //println "debug line"
    //println "${input} ${color}"
    println "${colors[color]}${input}${colors['reset']}"


    return "${colors[color]}${input}${colors['reset']}"
}
