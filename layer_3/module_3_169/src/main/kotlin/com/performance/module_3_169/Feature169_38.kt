package com.performance.module_3_169

class Feature169UseCase2(
    private val repository: Feature169Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
