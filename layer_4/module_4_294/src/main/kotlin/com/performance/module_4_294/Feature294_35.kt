package com.performance.module_4_294

class Feature294UseCase1(
    private val repository: Feature294Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
