package KBoy

import kotlin.collections.mutableMapOf

enum class REGS {
    AF,
    BC,
    DE,
    HL,
    A,
    F,
    B,
    C,
    D,
    E,
    H,
    L
}

@ExperimentalUnsignedTypes
class Registers {

    // AF, BC, DE, HL
    private var registers = UShortArray(4)
    private val getRegister =
            mapOf(
                    REGS.AF to registers[0].toInt(),
                    REGS.BC to registers[1].toInt(),
                    REGS.DE to registers[2].toInt(),
                    REGS.HL to registers[3].toInt(),
                    REGS.A to registers[0].and(0xf0u).toInt().shr(8),
                    REGS.F to registers[0].and(0x0fu).toInt(),
                    REGS.B to registers[1].and(0xf0u).toInt().shr(8),
                    REGS.C to registers[1].and(0x0fu).toInt(),
                    REGS.D to registers[2].and(0xf0u).toInt().shr(8),
                    REGS.E to registers[2].and(0x0fu).toInt(),
                    REGS.H to registers[3].and(0xf0u).toInt().shr(8),
                    REGS.L to registers[3].and(0x0fu).toInt(),
            )

    public fun getRegisterValue(reg: REGS): Int{
        return getRegister.?get(reg)
    }
}
