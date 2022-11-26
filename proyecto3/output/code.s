.data
	_t0: .word 5
	_t1: .word 10
	_t2: .word 0
	_t3: .word 1
	_t4: .word 2
	_t5: .word 0
	_t6: .word 0
	_a: .word 0
	_t8: .asciiz "Hello, World.\n"


.text
.globl main
main:



	lw $t1, _t0
	lw $t2, _t1
	add $t0, $t1, $t2
	sw $t0, _t2



	lw $t1, _t3
	lw $t2, _t4
	mul $t0, $t1, $t2
	sw $t0, _t5

	lw $t1, _t5
	sw $t1, _t6
	#lw $t0, _t5

	lw $t1, _t2
	lw $t2, _t6
	sub $t0, $t1, $t2
	sw $t0, _a


	la $a0, _t8
	li $v0, 4
	syscall

	lw $a0, _a
	li $v0, 1
	syscall

	#goto l_0