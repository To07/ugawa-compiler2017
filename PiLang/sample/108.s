	.section .data
	@ 大域変数の定義
	.section .text
	.global _start
_start:
	@ main関数を呼出す．戻り値は r0 に入る
	bl main
	@ EXITシステムコール
	mov r7, #1
	swi #0
main:
	@ prologue
	str r11, [sp, #-4]!
	mov r11, sp
	str r14, [sp, #-4]!
	str r1, [sp, #-4]!
	sub sp, sp, #0
	ldr r0, =#100
	bl print_r0
	ldr r0, =#1
	str r1, [sp, #-4]!
	mov r1, r0
	ldr r0, =#2
	add r0, r1, r0
	ldr r1, [sp], #4
	bl print_r0
	ldr r0, =#0
	b L0
	mov r0, #0
L0:
	@ epilogue
	add sp, sp, #0
	ldr r1, [sp], #4
	ldr r14, [sp], #4
	ldr r11, [sp], #4
	bx r14
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
