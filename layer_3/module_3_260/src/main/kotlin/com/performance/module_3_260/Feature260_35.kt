package com.performance.module_3_260

class Feature260UseCase1(
    private val repository: Feature260Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
