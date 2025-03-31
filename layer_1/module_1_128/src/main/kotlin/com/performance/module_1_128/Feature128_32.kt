package com.performance.module_1_128

class Feature128UseCase0(
    private val repository: Feature128Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
