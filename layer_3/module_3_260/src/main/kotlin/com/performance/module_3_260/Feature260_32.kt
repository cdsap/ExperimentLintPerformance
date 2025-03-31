package com.performance.module_3_260

class Feature260UseCase0(
    private val repository: Feature260Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
