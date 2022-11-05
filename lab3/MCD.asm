.data
numero1: .word 12
numero2: .word 36

.text
.globl main
main:
    lw $a0,numero1
    lw $a1,numero2
    jal MaximoComunDivisor

    add $a0,$v0,$zero
    li $v0,1
    syscall
li $v0, 10
syscall

MaximoComunDivisor:
    addi $sp, $sp, -12
    sw $ra, 0($sp)
    sw $s0, 4($sp)
    sw $s1, 8($sp)

    add $s0, $a0, $zero # s0 = a0 ( value numero1 )
    add $s1, $a1, $zero # s1 = a1 ( value numero2 )

    addi $t1, $zero, 0
    beq $s1, $t1, returnn1

    add $a0, $zero, $s1
    div $s0, $s1
    mfhi $a1

    jal MaximoComunDivisor

salir:
    lw $ra, 0 ($sp)
    lw $s0, 4 ($sp)
    lw $s1, 8 ($sp)
    addi $sp,$sp , 12
    jr $ra
returnn1:
    add $v0, $zero, $s0 # return $v0 = $s0 ( numero1)
    j salir
