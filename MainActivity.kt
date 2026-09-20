class MainActivity : AppCompatActivity() {
    private lateinit var tts: TextToSpeech
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val ethics = assets.open("ethics.json").bufferedReader().use { it.readText() }
        
        findViewById<Button>(R.id.btnTalk).setOnClickListener {
            val userCommand = "battery bata"
            if (JarvisCore.checkEthics(userCommand, ethics)) {
                speak("Yes Boss Rohan, Battery 87% hai. RC-120X standby pe hai.")
            }
        }
        findViewById<Button>(R.id.btnKill).setOnClickListener {
            // Kill-switch
            finishAffinity() // App OFF
        }
    }
    fun speak(text: String) {
        // TTS code
    }
}
