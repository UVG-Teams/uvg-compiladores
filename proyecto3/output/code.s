.data
	_t0: .word 1
	_t1: .word 4
	_a: .word 0
	_t3: .asciiz "Hello, World.\n"


.text
.globl main
main:

	#_t2 <- _t0 + _t1
	lw $t1, _t0
	lw $t2, _t1
	add $t0, $t1, $t2
	sw $t0, _a

	# Output String
	la $a0, _t3
	li $v0, 4
	syscall

	#goto l_0

exit_program:
	li $v0, 10
	syscall