package com.performance.module_3_260

class Feature260UseCase2(
    private val repository: Feature260Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
