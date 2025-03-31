package com.performance.module_4_294

class Feature294UseCase0(
    private val repository: Feature294Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
