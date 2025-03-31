package com.performance.module_0_32

class Feature32UseCase2(
    private val repository: Feature32Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
