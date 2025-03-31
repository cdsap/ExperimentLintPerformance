package com.performance.module_3_257

class Feature257UseCase0(
    private val repository: Feature257Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
