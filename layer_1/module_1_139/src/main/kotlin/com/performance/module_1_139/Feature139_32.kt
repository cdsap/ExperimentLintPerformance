package com.performance.module_1_139

class Feature139UseCase0(
    private val repository: Feature139Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
