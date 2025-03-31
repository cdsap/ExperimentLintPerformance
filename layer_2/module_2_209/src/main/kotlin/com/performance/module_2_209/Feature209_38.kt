package com.performance.module_2_209

class Feature209UseCase2(
    private val repository: Feature209Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
