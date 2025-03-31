package com.performance.module_2_221

class Feature221UseCase0(
    private val repository: Feature221Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
