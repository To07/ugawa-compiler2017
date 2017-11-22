	.section .data
	@ 大域変数の定数
_Pi_var_x:
	.word 0
_Pi_var_answer:
	.word 0
	.section .text
	.global _start
_start:
	@ 式をコンパイルした命令列
	ldr r0, =#1
	ldr r1, =_Pi_var_x
	str r0, [r1, #0]
	ldr r0, =_Pi_var_x
	ldr r0, [r0, #0]
	str r1, [sp, #-4]!
	mov r1, r0
	ldr r0, =#10
	add r0, r1, r0
	ldr r1, [sp], #4
	bl print_r0
	@ EXITシステムコール
	mov r7, #1
	mov r0, #0
	swi #0
print_r0:
	str r0, [sp, #-4]!
	str r1, [sp, #-4]!
	str r2, [sp, #-4]!
	str r3, [sp, #-4]!
	str r4, [sp, #-4]!
	str r7, [sp, #-4]!
print:
	ldr r1, =buf+8
	mov r3, #8
	add r2, r1, #1
loop0:
	mov r4, r0, lsr #4
	eor r7, r0, r4, lsl #4
	cmp r7, #10
	addcc r7, r7, #48
	addge r7, r7, #55
	mov r0, r4
	strb r7, [r1, #-1]!
	subs r3, r3, #1
	bne loop0
	sub r2, r2, r1
endloop:
	mov r7, #4
	mov r0, #1
	swi #0
	ldr r7, [sp], #4
	ldr r4, [sp], #4
	ldr r3, [sp], #4
	ldr r2, [sp], #4
	ldr r1, [sp], #4
	ldr r0, [sp], #4
	bx r14
	.section .data
buf:
	.space 8
	.byte 10
