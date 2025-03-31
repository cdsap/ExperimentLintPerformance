package com.performance.module_0_32

class Feature32UseCase1(
    private val repository: Feature32Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
