.data
	_t0: .word 1
	_t1: .word 4
	_a: .word 0
	_t3: .word 5
	_t4: .word 11
	_t5: .word 0
	_t6: .word 1
	_t7: .word 2
	_t8: .word 0
	_t9: .word 0
	_b: .word 0
	_t11: .asciiz "Hello, World.\n"
	_t14: .asciiz "\n"


.text
.globl main
main:



	lw $t1, _t0
	lw $t2, _t1
	add $t0, $t1, $t2
	sw $t0, _a



	lw $t1, _t3
	lw $t2, _t4
	add $t0, $t1, $t2
	sw $t0, _t5



	lw $t1, _t6
	lw $t2, _t7
	mul $t0, $t1, $t2
	sw $t0, _t8

	lw $t1, _t8
	sw $t1, _t9
	#lw $t0, _t8

	lw $t1, _t5
	lw $t2, _t9
	sub $t0, $t1, $t2
	sw $t0, _b


	la $a0, _t11
	li $v0, 4
	syscall

	lw $a0, _a
	li $v0, 1
	syscall


	la $a0, _t14
	li $v0, 4
	syscall

	lw $a0, _b
	li $v0, 1
	syscall

	#goto l_0