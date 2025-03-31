package com.performance.module_2_221

class Feature221UseCase2(
    private val repository: Feature221Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
