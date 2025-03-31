package com.performance.module_2_209

class Feature209UseCase0(
    private val repository: Feature209Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
