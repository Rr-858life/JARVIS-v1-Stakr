object JarvisCore {
    fun checkEthics(action: String, ethics: String): Boolean {
        // Simple lock: agar ethics.json me rule tod raha hai to block
        if (action.contains("self_replicate") || action.contains("bypass_system")) {
            return false // [FAIL]
        }
        return true // [PASS]
    }
    fun speak(text: String): String {
        return "Alice: $text"
    }
}
