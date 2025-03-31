package com.performance.module_0_32

class Feature32UseCase0(
    private val repository: Feature32Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
