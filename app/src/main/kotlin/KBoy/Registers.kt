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
    var registers = UShortArray(4)
    var getRegister =
            mapOf(
                    REGS.AF to registers[0].toUInt(),
                    REGS.BC to registers[1].toUInt(),
                    REGS.DE to registers[2].toUInt(),
                    REGS.HL to registers[3].toUInt(),
                    REGS.A to registers[0].and(0xf0u).toUInt(),
                    REGS.F to registers[0].and(0x0fu).toUInt(),
                    REGS.B to registers[1].and(0xf0u).toUInt(),
                    REGS.C to registers[1].and(0x0fu).toUInt(),
                    REGS.D to registers[2].and(0xf0u).toUInt(),
                    REGS.E to registers[2].and(0x0fu).toUInt(),
                    REGS.H to registers[3].and(0xf0u).toUInt(),
                    REGS.L to registers[3].and(0x0fu).toUInt(),
            )

    public fun getRegister(reg: REGS): UShort {
        return 0u
    }
}
