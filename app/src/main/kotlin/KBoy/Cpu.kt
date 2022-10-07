package KBoy

@ExperimentalUnsignedTypes
class Cpu(filename: String) {

    // TODO: Registers object

    private var tCyclesPerFrame = 0
    private var PC = 0
    private var SP = 0

    private var memory = UByteArray(0xFFFF)

    init {
        loadRomIntoMemory(filename)
    }

    // Load NROM 0 into memory, this is not finished
    private fun loadRomIntoMemory(filename: String) {}

    // Executes the necessary ticks to complete 1 frame of cycles (70222 t-cycles)
    public fun update() {
        tCyclesPerFrame = 0

        while (tCyclesPerFrame < 70222) {
            val deltaCycles = tick()

            tCyclesPerFrame += deltaCycles
        }
    }

    /** Advances the machine 4 T-Cycles */
    private fun tick4Cycles() {
        tCyclesPerFrame += 4
    }

    /* Does one opcode fetching and executing cycle
     * return: Amount of t-cycles used in the tick
     */
    private fun tick(): Int {
        return 1
    }
}
