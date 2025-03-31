package com.performance.module_0_128

class Feature128UseCase2(
    private val repository: Feature128Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
